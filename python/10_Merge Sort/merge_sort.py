def merge(arr, left, right):
    i = j = k = 0
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            arr[k] = left[i]
            i = i + 1
        else:
            arr[k] = right[j]
            j = j + 1
        k = k + 1

    while i < len(left):
        arr[k] = left[i]
        i = i + 1
        k = k + 1
    
    while j < len(right):
        arr[k] = right[j]
        j = j + 1
        k = k + 1
    
def merge_sort(nums):
    if len(nums) <= 1:
        return nums
    mid = len(nums) // 2
    left = merge_sort(nums[:mid])
    right = merge_sort(nums[mid:])
    merge(nums, left, right)
    return nums

print(merge_sort([5, 4, 3, 2, 1]))
