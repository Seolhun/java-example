# Question 3

<div id="brinza-task-description">
<p>People are waiting for an elevator in a hotel. The elevator has limited capacity and you would like to analyse its movement.</p>
<p>The hotel has floors numbered from 0 (ground floor) to M. The elevator has a maximum capacity of X people and a weight limit of Y. There are N people gathered at the ground floor, standing in a queue for the elevator. You are given every person's weight A[K] and target floor B[K]. (That is, A[0] and B[0] represent the first person in the queue.)</p>
<p>People continue to enter the elevator, in the order of their position in the queue (and push the buttons for their target floors), for as long as there is room for them. (The queue order cannot be changed even if there is room in the elevator for a particular person from the middle of the queue.) Then elevator goes up and stops at every selected floor, and finally returns to the ground floor. This process is repeated until there are no more people in the queue. The goal is to count the total number of times that the elevator stops.</p>
<p>For example, consider a hotel with floors numbered from 0 to M = 5, with an elevator with a maximum capacity of X = 2 people and a weight limit of Y = 200. The weights A and target floors B are:</p>
<tt style="white-space:pre-wrap">    A[0] = 60    B[0] = 2
    A[1] = 80    B[1] = 3
    A[2] = 40    B[2] = 5</tt>
<p>The elevator will take the first two passengers together, stop at the 2nd and 3rd floors, then return to the ground floor. Then, it will take the last passenger, stop at the 5th floor and return to the ground floor. In total, the elevator will stop five times. Note that this number includes the last stop at the ground floor.</p>
<p>Write a function:</p>
<blockquote><p style="font-family: monospace; font-size: 9pt; display: block; white-space: pre-wrap"><tt>class Solution { public int solution(int[] A, int[] B, int M, int X, int Y); }</tt></p></blockquote>
<p>that, given zero-indexed arrays A and B consisting of N integers, and numbers X, Y and M as described above, returns the total number of times the elevator stops.</p>
<p>For example, given the above data, the function should return 5, as explained above.</p>
<p>For example, given M = 3, X = 5, Y = 200 and the following arrays:</p>
<tt style="white-space:pre-wrap">    A[0] =  40    B[0] = 3
    A[1] =  40    B[1] = 3
    A[2] = 100    B[2] = 2
    A[3] =  80    B[3] = 2
    A[4] =  20    B[4] = 3</tt>
<p>the function should return 6, as the elevator will move in two stages: with the first three people and then with the two remaining people.</p>
<p>Assume that:</p>
<blockquote><ul style="margin: 10px;padding: 0px;"><li>N, M and X are integers within the range [<span class="number">1</span>..<span class="number">100,000</span>];</li>
<li>Y is an integer within the range [<span class="number">1</span>..<span class="number">1,000,000,000</span>];</li>
<li>each element of array A is an integer within the range [<span class="number">1</span>..<span class="number">Y</span>];</li>
<li>each element of array B is an integer within the range [<span class="number">1</span>..<span class="number">M</span>].</li>
</ul>
</blockquote><p>Complexity:</p>
<blockquote><ul style="margin: 10px;padding: 0px;"><li>expected worst-case time complexity is O(N*log(N)+M);</li>
<li>expected worst-case space complexity is O(N+M), beyond input storage (not counting the storage required for input arguments).</li>
</ul>
</blockquote></div>