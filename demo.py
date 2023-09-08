def removeDupli(nums):
    res = [nums[0]]
    for i in range(1,len(nums)):
        if nums[i] != nums[i-1]:
            res.append(nums[i])
    return res

print(removeDupli([1,2,2,3,4,5,5]))


def findsec(nums):
    