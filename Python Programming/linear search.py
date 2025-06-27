def linear_search(arr,target):
    for index,element in enumerate(arr):
        if element==target:
            return index
    return -1

arr=[4,2,7,1,9,3]
target=1

index=linear_search(arr,target)

if index!= -1:
    print(f"Element {target} found at index {index}")
else:
    print(f"Element {target} not found in the array")