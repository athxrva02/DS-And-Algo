def insertion_sort(nums): # Good for almost sorted data
    for i in range(1, len(nums)):
        temp = nums[i]
        j = i - 1
        while temp < nums[j] and j > -1:
            nums[j + 1] = nums[j]
            nums[j] = temp
            j -= 1
    return nums

print(insertion_sort([5,3,8,6,7,2]))