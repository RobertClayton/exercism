class Allergies(object):

    def __init__(self, score):
        self.allergies_score = score
        self.allergies = {
            1: 'eggs',
            2: 'peanuts',
            4: 'shellfish',
            8: 'strawberries',
            16: 'tomatoes',
            32: 'chocolate',
            64: 'pollen',
            128: 'cats'
        }

    def is_allergic_to(self, item):
        allergy_lst = self.lst
        if item in allergy_lst:
            return True
        return False

    @property
    def lst(self):
        score = self.allergies_score
        allergy_list = []
        if score % 2 != 0:
            allergy_list.append(self.allergies[1])
            score -= 1

        i = score
        while i > 1:
            if self.allergies.has_key(i):
                allergy_list.append(self.allergies[i])
                score -= i
            i -= 1
        return allergy_list