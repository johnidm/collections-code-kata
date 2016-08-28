import print_numbers


class Number():

    def __init__(self, numbers):
        self.numbers = numbers

    def odd(self):
        ret_odd = []
        for n in self.numbers:
            if n % 2 == 1:
                ret_odd.append(n)
        return ret_odd

    def range_nums(self, start, end):

        nums = self.numbers[start:end]
        return nums

    def display(self, label):
        print(label)
        for n in self.numbers:
            print('{} - '.format(n))

    def display_odd(self):
        odd = self.odd()
        for n in odd:
            print(n)

    def run_all(self):

        odd = self.odd()
        range_nums = self.range_nums(0,2)
        self.display('Printing')
        self.display_odd()

        print_numbers.pretty_print(odd)




λ = [1, 8, 5, 3, 6]
# ξ = Number(λ)
# print(ξ.odd())

# π = Number(λ)
# print(π.range_nums(2, 4))

# ψ = Number(λ)
# ψ.display_odd()

import pdb; pdb.set_trace()
ζ = Number(λ)
ζ.run_all()




