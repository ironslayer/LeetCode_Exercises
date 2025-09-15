// My solution
// function removeDuplicates(nums: number[]): number {
//     if (nums.length === 0) return 0;

//     let j = 1; 
//     for (let i = 1; i < nums.length; i++) {
//         if (nums[i] !== nums[i - 1]) {
//             nums[j] = nums[i];
//             j++;
//         }
//     }

//     return j;
// }

//Other solution
function removeDuplicates(nums: number[]): number {
    let k = 1

    for(let i = 1; i< nums.length; i++){
        if(nums[i] != nums[k -1]){
            nums[k] = nums[i]
            k ++;
        }
    }
    for(let i = k; i< nums.length; i++){
        (nums as any)[i] = "_"
    }
        return k;
};


const nums1 = [0,0,1,1,1,2,2,3,3,4];
const k1 = removeDuplicates(nums1);
console.log("k1 =", k1, ", nums1 =", nums1.slice(0, k1));

const nums2 = [1,1,2];
const k2 = removeDuplicates(nums2);
console.log("k2 =", k2, ", nums2 =", nums2.slice(0, k2));

const nums3 = [3,3];
const k3 = removeDuplicates(nums3);
console.log("k3 =", k3, ", nums3 =", nums3.slice(0, k3));
