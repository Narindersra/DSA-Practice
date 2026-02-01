def validAnagram(s, t):
    if len(s) != len(t):
        return False
    
    count = {}

    for char in s:
        count[char] = count.get(char, 0) + 1

    for char in t:
        count[char] = count.get(char, 0) - 1

    for val in count.values():
        if val != 0:
            return False
        
    return True


s = 'anagram'
t = 'nagaram'

print(validAnagram(s, t))


s1 = 'cat'
t1 = 'rat'
print(validAnagram(s1, t1))
