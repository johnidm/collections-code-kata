import unittest


def division_by_zero():
    100 / 0


def define_user(user):
    if not user:
        raise Exception('User is not defined')


class MyTest(unittest.TestCase):

    def test_division_by_zero(self):
        with self.assertRaises(ZeroDivisionError):
            division_by_zero()

    def test_user_is_empty(self):
        with self.assertRaises(Exception) as ex:
            define_user('')

        self.assertEqual(
            str(ex.exception), 'User is not defined')

