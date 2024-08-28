<h2><a href="https://leetcode.com/problems/combination-sum/">39. Combination Sum</a></h2><h3>Medium</h3><hr><div><p data-relingo-block="true" data-relin-paragraph="25">Given an array of <strong>distinct</strong> integers <code>candidates</code> and a target integer <code>target</code>, return <em>a list of all <strong>unique combinations</strong> of </em><code>candidates</code><em> where the chosen numbers sum to </em><code>target</code><em>.</em> You may return the combinations in <strong>any order</strong>.</p>

<p data-relingo-block="true" data-relin-paragraph="26">The <strong>same</strong> number may be chosen from <code>candidates</code> an <strong>unlimited number of times</strong>. Two combinations are unique if the <span data-keyword="frequency-array">frequency</span> of at least one of the chosen numbers is different.</p>

<p data-relingo-block="true" data-relin-paragraph="27">The test cases are generated such that the number of unique combinations that sum up to <code>target</code> is less than <code>150</code> combinations for the given input.</p>

<p data-relingo-block="true">&nbsp;</p>
<p data-relingo-block="true" data-relin-paragraph="28"><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> candidates = [2,3,6,7], target = 7
<strong>Output:</strong> [[2,2,3],[7]]
<strong>Explanation:</strong>
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
</pre>

<p data-relingo-block="true" data-relin-paragraph="29"><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> candidates = [2,3,5], target = 8
<strong>Output:</strong> [[2,2,2,2],[2,3,3],[3,5]]
</pre>

<p data-relingo-block="true" data-relin-paragraph="30"><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> candidates = [2], target = 1
<strong>Output:</strong> []
</pre>

<p data-relingo-block="true">&nbsp;</p>
<p data-relingo-block="true" data-relin-paragraph="31"><strong>Constraints:</strong></p>

<ul>
	<li data-relingo-block="true" data-relin-paragraph="32"><code>1 &lt;= candidates.length &lt;= 30</code></li>
	<li data-relingo-block="true" data-relin-paragraph="33"><code>2 &lt;= candidates[i] &lt;= 40</code></li>
	<li data-relingo-block="true" data-relin-paragraph="34">All elements of <code>candidates</code> are <strong>distinct</strong>.</li>
	<li data-relingo-block="true" data-relin-paragraph="35"><code>1 &lt;= target &lt;= 40</code></li>
</ul>
</div>