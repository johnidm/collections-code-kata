from django.views.generic import ListView
from django.views.generic import CreateView
from django.views.generic import UpdateView
from django.views.generic import DeleteView
from django.views.generic import DetailView

from django.core.urlresolvers import reverse
from contacts.models import Contact

from contacts.forms import ContactForm, ContactAddressFormSet

from django.contrib.auth.decorators import login_required
from django.utils.decorators import method_decorator

from django.core.exceptions import PermissionDenied


class ContactOwnerMixin(object):

	def get_object(self, queryset=None):

		if queryset is None:
			queryset = self.get_queryset()

		pk = self.kwargs.get(self.pk_url_kwarg, None)
		queryset = queryset.filter(
			pk=pk,
			owner=self.request.user,
		)

		try:
			obj = queryset.get()
		except ObjectDoesNotExist:
			raise PermissionDenied

		return obj


class LoggedInMixin(object):

	@method_decorator(login_required)
	def dispatch(self, *args, **kwargs):
		return super(LoggedInMixin, self).dispatch(*args, **kwargs)


class EditContactAddressView(UpdateView):
	
	model = Contact
	template_name = 'edit_addresses.html'

	form_class = ContactAddressFormSet

	def get_success_url(self):
		return reverse('contacts-list')	
	
		

class ContactView(DetailView):
	model = Contact
	template_name = 'contact.html'

	def get_absolute_url(self):
		return reverse('contacts-view', kwargs={'pk' : self.id})


class DeleteContactView(DeleteView):
	model = Contact
	template_name = 'delete_contact.html'

	def get_success_url(self):
		return reverse('contacts-list')


class ListContactView(LoggedInMixin, ContactOwnerMixin, ListView):
	model = Contact
	template_name = 'contact_list.html'

	def get_queryset(self):
		return Contact.objects.filter(owner=self.request.user)


class CreateContactView(CreateView):

	model = Contact
	template_name = 'edit_contact.html'
	form_class = ContactForm

	def get_success_url(self):
		return reverse('contacts-list')

	def get_context_data(self, **kwargs):
		context = super(CreateContactView, self).get_context_data(**kwargs)
		context['action'] = reverse('contacts-new')

		return context

class UpdateContactView(UpdateView):
	
	model = Contact
	template_name = 'edit_contact.html'
	form_class = ContactForm

	def get_success_url(self):
		return reverse('contacts-list')	

	def get_context_data(self, **kwargs):
		context = super(UpdateContactView, self).get_context_data(**kwargs)
		context['action'] = reverse('contacts-edit', 
			kwargs={'pk' : self.get_object().id})

		return context





