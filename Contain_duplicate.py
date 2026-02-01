def containDuplicate(nums):
    ans = set()
    n =len(nums)

    for num in nums:
        if num in ans:
            return True
        ans.add(num)

    return False

def containDuplicate1(nums):
    return len(nums) != len(set(nums))

nums = [1, 2, 3, 1]
print(containDuplicate(nums))
print(containDuplicate1(nums))

nums1 = [1, 2, 3, 4]
print(containDuplicate(nums1))
print(containDuplicate1(nums1))