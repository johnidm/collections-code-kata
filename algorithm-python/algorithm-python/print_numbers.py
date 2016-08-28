

def pretty_print(number):
    import pdb; pdb.set_trace()
    print('|-', '-' * 6)
    for n in number:
        print(' {} '.format(n))
    print('|-', '-' * 6)


def divide_by_zero(number, divisor):
    division = number / divisor
    return division
