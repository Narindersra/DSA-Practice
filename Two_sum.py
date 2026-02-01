def twoSum(nums, target):
    hashmap = {}
    n = len(nums)

    for i in range(n):
        num = nums[i]
        complement = target - num
        if complement in hashmap:
            return [hashmap[complement], i]
        hashmap[num] = i

    return []


nums = [2, 7, 11, 15]

target = 9

print(twoSum(nums, target))

