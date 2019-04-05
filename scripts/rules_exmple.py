from sinling.sinhala import word_joiner

# Following examples are from https://si.wikipedia.org/wiki/සිංහල_සන්ධි
from sinling.sinhala.preprocess import preprocess

examples = [
    ('ඔවුන්', 'ඔවුන්', 'ඔවුනොවුන්', 'ස්වර සන්ධිය'),
    ('උපන්', 'උපන්', 'උපනුපන්', 'ස්වර සන්ධිය'),
    # --------------------------------------------------------------------------
    ('දකුණු', 'ඇස', 'දකුණැස', 'පූර්වස්වර (පූර්ව ස්වර) ලෝප සන්ධිය'),
    ('ගමන', 'ආගමනය', 'ගමනාගමනය', 'පූර්වස්වර (පූර්ව ස්වර) ලෝප සන්ධිය'),
    ('සුර', 'ඉඳු', 'සුරිඳු', 'පූර්වස්වර (පූර්ව ස්වර) ලෝප සන්ධිය'),
    ('නර', 'ඉඳු', 'නිරිඳු', 'පූර්වස්වර (පූර්ව ස්වර) ලෝප සන්ධිය'),
    ('යන', 'එන', 'යනෙන', 'පූර්වස්වර (පූර්ව ස්වර) ලෝප සන්ධිය'),
    ('කර්ණ', 'ආභරණ', 'කර්ණාභරණ', 'පූර්වස්වර (පූර්ව ස්වර) ලෝප සන්ධිය'),
    ('උදර', 'ආබාධ', 'උදරාබාධ', 'පූර්වස්වර (පූර්ව ස්වර) ලෝප සන්ධිය'),
    ('සිය', 'ඇසින්', 'සියැසින්', 'පූර්වස්වර (පූර්ව ස්වර) ලෝප සන්ධිය'),
    # --------------------------------------------------------------------------
    ('මුනි', 'උතුමා', 'මුනිතුමා', 'පරස්වර (පර ස්වර) ලෝප සන්ධිය'),
    ('ගුරු', 'උතුමා', 'ගුරුතුමා', 'පරස්වර (පර ස්වර) ලෝප සන්ධිය'),
    # --------------------------------------------------------------------------
    ('මහ', 'ඉසුරු', 'මහෙසුරු', 'ස්වරාදේශ (ස්වර ආදේශ ) සන්ධිය'),
    ('වට', 'උර', 'වටොර', 'ස්වරාදේශ (ස්වර ආදේශ ) සන්ධිය'),
    ('සහ', 'උදර', 'සහෝදර', 'ස්වරාදේශ (ස්වර ආදේශ ) සන්ධිය'),
    # --------------------------------------------------------------------------
    ('ගඟ', 'වතුර', 'ගoවතුර', 'ගාත්‍රාක්‍ෂර (ගාත්‍රා අක්‍ෂර) ලෝප සන්ධිය'),
    ('කොළඹ', 'තොට', 'කොළොම්තොට', 'ගාත්‍රාක්‍ෂර (ගාත්‍රා අක්‍ෂර) ලෝප සන්ධිය'),
    # --------------------------------------------------------------------------
    ('ගිනි', 'කම්', 'ගිනියම්', 'ගාත්‍රාදේශ (ගාත්‍ර ආදේශ) සන්ධිය'),
    ('කබ්', 'පිල', 'කප්පිල', 'ගාත්‍රාදේශ (ගාත්‍ර ආදේශ) සන්ධිය'),
    ('බුද්', 'සරණ', 'බුත්සරණ', 'ගාත්‍රාදේශ (ගාත්‍ර ආදේශ) සන්ධිය'),
    # --------------------------------------------------------------------------
    ('වත්', 'කම්', 'වත්තම්', 'පූර්වරූප (පූර්ව රූප) සන්ධිය'),
    ('අත්', 'කම්', 'අත්තම්', 'පූර්වරූප (පූර්ව රූප) සන්ධිය'),
    # --------------------------------------------------------------------------
    ('අත්', 'සන', 'අස්සන', 'පරරූප (පර රූප) සන්ධිය'),
    ('ලක්', 'ගල', 'ලග්ගල', 'පරරූප (පර රූප) සන්ධිය'),
    # --------------------------------------------------------------------------
    ('වැදි', 'ආ', 'වැද්දා', 'ද්විත්වරූප (ද්විත්ව රූප ) සන්ධිය'),
    # --------------------------------------------------------------------------
    ('පිරි', 'අත්', 'පිරියත්', 'ආගම සන්ධිය'),
    ('දැන්', 'දු', 'දැනුදු', 'ආගම සන්ධිය'),
]

if __name__ == '__main__':
    # examples = [examples[2]]
    for w1, w2, r1, c in examples:
        if c != '':
            is_true = False
            w1, w2 = preprocess(w1), preprocess(w2)
            for r2 in word_joiner.join(w1, w2):
                if r1 == r2:
                    is_true = True
                # ff = '{:<35}' + '{:<10} ' * 5
                # print(ff.format(c, w1, w2, r1, r2, r1 == r2))
            if is_true:
                print(r1, 'True')
            else:
                print(r1, 'False')
