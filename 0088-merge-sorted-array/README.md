<h2><a href="https://leetcode.com/problems/merge-sorted-array/">88. Merge Sorted Array</a></h2><h3>Easy</h3><hr><div><p data-relingo-block="true" data-relin-paragraph="43">You are given two integer arrays <code>nums1</code> and <code>nums2</code>, sorted in <strong>non-decreasing order</strong>, and two integers <code>m</code> and <code>n</code>, representing the number of elements in <code>nums1</code> and <code>nums2</code> respectively.</p>

<p data-relingo-block="true" data-relin-paragraph="44"><strong>Merge</strong> <code>nums1</code> and <code>nums2</code> into a single array sorted in <strong>non-decreasing order</strong>.</p>

<p data-relingo-block="true" data-relin-paragraph="45">The final sorted array should not be returned by the function, but instead be <em>stored inside the array </em><code>nums1</code>. To accommodate this, <code>nums1</code> has a length of <code>m + n</code>, where the first <code>m</code> elements denote the elements that should be merged, and the last <code>n</code> elements are set to <code>0</code> and should be ignored. <code>nums2</code> has a length of <code>n</code>.</p>

<p data-relingo-block="true">&nbsp;</p>
<p data-relingo-block="true" data-relin-paragraph="46"><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
<strong>Output:</strong> [1,2,2,3,5,6]
<strong>Explanation:</strong> The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [<u>1</u>,<u>2</u>,2,<u>3</u>,5,6] with the underlined elements coming from nums1.
</pre>

<p data-relingo-block="true" data-relin-paragraph="47"><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums1 = [1], m = 1, nums2 = [], n = 0
<strong>Output:</strong> [1]
<strong>Explanation:</strong> The arrays we are merging are [1] and [].
The result of the merge is [1].
</pre>

<p data-relingo-block="true" data-relin-paragraph="48"><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> nums1 = [0], m = 0, nums2 = [1], n = 1
<strong>Output:</strong> [1]
<strong>Explanation:</strong> The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
</pre>

<p data-relingo-block="true">&nbsp;</p>
<p data-relingo-block="true" data-relin-paragraph="49"><strong>Constraints:</strong></p>

<ul>
	<li data-relingo-block="true" data-relin-paragraph="50"><code>nums1.length == m + n</code></li>
	<li data-relingo-block="true" data-relin-paragraph="51"><code>nums2.length == n</code></li>
	<li data-relingo-block="true" data-relin-paragraph="52"><code>0 &lt;= m, n &lt;= 200</code></li>
	<li data-relingo-block="true" data-relin-paragraph="53"><code>1 &lt;= m + n &lt;= 200</code></li>
	<li data-relingo-block="true" data-relin-paragraph="54"><code>-10<sup>9</sup> &lt;= nums1[i], nums2[j] &lt;= 10<sup>9</sup></code></li>
</ul>

<p data-relingo-block="true">&nbsp;</p>
<p data-relingo-block="true" data-relin-paragraph="55"><strong>Follow up: </strong>Can you come up with an algorithm that runs in <code>O(m + n)</code> time?</p>
</div>