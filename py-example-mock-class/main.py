class PaymentValidator():

    def __init__(self):
        self.message = ''
        self.error = False

    @property
    def error(self):
        return self.__error

    @property
    def message(self):
        return self.__message

    @error.setter
    def error(self, error):
        self.__error = error

    @message.setter
    def message(self, message):
        self.__message = message


def validate_payment():
    validator = PaymentValidator()
    validator.error = False
    validator.message = 'Card number is wrong'


def pay():

    def checkout():
        pass

    validation = validate_payment()
    if validation.error:
        raise Exception(validation.message)
    else:
        checkout()
        return True
