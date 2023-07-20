def merge(ls1, ls2):
    combined = []
    i = 0
    j = 0
    while i < len(ls1) and j < len(ls2):
        if ls1[i] < ls2[j]:
            combined.append(ls1[i])
            i += 1
        else:
            combined.append(ls2[j])
            j += 1
    while i < len(ls1):
        combined.append(ls1[i])
        i += 1
    while j < len(ls2):
        combined.append(ls2[j])
        j += 1
    return combined

def merge_sort(nums):
    mid_index = int(len(nums)/2)
    left = nums[:mid_index]
    right = nums[mid_index:]
    if len(nums) > 1:
        