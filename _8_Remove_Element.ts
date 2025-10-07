
// My solution
// function removeElement(nums: number[], val: number): number {
//     let j = 0;
//     for (let i = 0; i < nums.length; i++) {
//         if (nums[i] !== val) {
//             nums[j] = nums[i];
//             j++;
//         }
//     }
//     return j; 
// }

//Other solution
function removeElement(nums: number[], val: number): number {
    let l = 0, r = nums.length - 1;
    
    while (l <= r) {
        if (nums[l] !== val) {
            l++;
        } else {
            while (nums[r] === val) {
                r--;
            }

            if (l > r) break;

            nums[l] = nums[r];
            l++;
            r--;
        }
    }

    return l;
};

let nums4 = [3, 2, 2, 3];
let k4 = removeElement(nums4, 3);
console.log("k1 =", k4, ", nums1 =", nums4.slice(0, k4));

let nums5 = [0, 1, 2, 2, 3, 0, 4, 2];
let k5 = removeElement(nums5, 2);
console.log("k2 =", k5, ", nums2 =", nums5.slice(0, k5));

let nums6 = [3, 3];
let k6 = removeElement(nums6, 3);
console.log("k3 =", k6, ", nums3 =", nums6.slice(0, k6));

