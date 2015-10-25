import unittest
from unittest.mock import patch

from util import DictToObject
from main import pay


class TestPayment(unittest.TestCase):

    """
    Test mock objects
    How to run: `python -m test_main`
    """

    @patch('main.validate_payment',
           return_value=DictToObject(**{'error': False}))
    def test_success_payment(self, validate_payment):
        result = pay()
        self.assertTrue(result)
        self.assertTrue(validate_payment.called)
        # Other asserts

    @patch('main.validate_payment',
           return_value=DictToObject(**{'error': True, 'message': 'Card number is wrong'}))
    def test_invalid_card_number(self, validate_payment):

        with self.assertRaisesRegexp(Exception, 'Card number is wrong'):
            pay()

        self.assertTrue(validate_payment.called)
        # Other asserts

if __name__ == '__main__':
    unittest.main()
