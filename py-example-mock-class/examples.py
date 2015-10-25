from util import DictToObject


props = {
    'id': 12,
    'message': 'Hi, how are you?',
    'display': True,
}

MyClass = DictToObject(**props)

print('{} - {} - {}'.format(MyClass.id, MyClass.message, MyClass.display))

if hasattr(MyClass, 'id'):
    print('Property id exists in class MyClass')

message = getattr(MyClass, 'message')
print(message)

new_message = 'Just fine'
setattr(MyClass, 'message', new_message)
print('New message ', MyClass.message)
