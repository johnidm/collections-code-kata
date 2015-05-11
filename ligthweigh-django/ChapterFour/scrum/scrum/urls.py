from django.conf.urls import patterns, include, url

# Uncomment the next two lines to enable the admin:
# from django.contrib import admin
# admin.autodiscover()

from rest_framework.authtoken.views import obtain_auth_token

from board.urls import router

urlpatterns = [

	url(r'^api/token/', obtain_auth_token, name='api-token'),
	url(r'^api/', include(router.urls)),

	]

   