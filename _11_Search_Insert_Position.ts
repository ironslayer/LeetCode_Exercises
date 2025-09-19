// function searchInsert(nums: number[], target: number): number {
//     let start = 0;
//     let end = nums.length - 1;

//     while (start <= end) {
//         const mid = start + ((end - start) >>> 1);

//         if (target === nums[mid]) {
//             return mid;
//         }
//         if (target > nums[mid]) {
//             start = mid + 1;
//         } else {
//             end = mid - 1;
//         }
//     }

//     return start;
// }


//Other solution
function searchInsert(nums: number[], target: number): number {
    for(let i=0; i<nums.length; i++){
        if(nums[i]>=target){
            return i;
        }
    }

    return nums.length
};

console.log(searchInsert([1, 3, 5, 6], 5)); 
console.log(searchInsert([1, 3, 5, 6], 2)); 
console.log(searchInsert([1, 3, 5, 6], 7)); 
console.log(searchInsert([1, 3, 5, 6], 0)); 
