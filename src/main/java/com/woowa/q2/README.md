# Question 2

<div id="standard_task_description" class="protected"><div class="task-description-content">

<meta http-equiv="content-type" content="text/html; charset=utf-8">


<div id="brinza-task-description">
<p>John likes to travel. He has visited a lot of cities over many years. Whenever he visits a city, he takes a few photos and saves them on his computer. Each photo has a name with an extension ("<tt style="white-space:pre-wrap">jpg</tt>", "<tt style="white-space:pre-wrap">png</tt>" or "<tt style="white-space:pre-wrap">jpeg</tt>") and there is a record of the name of the city where the photo was taken and the time and date the photo; for example: "<tt style="white-space:pre-wrap">photo.jpg, Warsaw, 2013-09-05 14:08:15</tt>".</p>
<p>Note that, in some rare cases, photos from different locations may share the time and date, due to timezone differences.</p>
<p>John notices that his way of filing photos on his computer has become a mess. He wants to reorganize the photos. First he decides to group the photos by city, then, within each such group, sort the photos by the time they were taken and finally assign consecutive natural numbers to the photos, starting from 1. Afterwards he intends to rename all the photos. The new name of each photo should begin with the name of the city followed by the number already assigned to that photo. The number of every photo in each group should have the same length (equal to the length of the largest number in this group); thus, John needs to add some leading zeros to the numbers. The new name of the photo should end with the extension, which should remain the same.</p>
<p>Your task is to help John by finding the new name of each photo.</p>
<p>Each of John's photos has the format: "<tt style="white-space:pre-wrap">&lt;&lt;photoname&gt;&gt;.&lt;&lt;extension&gt;&gt;, &lt;&lt;city_name&gt;&gt;, yyyy-mm-dd hh:mm:ss</tt>", where "<tt style="white-space:pre-wrap">&lt;&lt;photoname&gt;&gt;</tt>", "<tt style="white-space:pre-wrap">&lt;&lt;extension&gt;&gt;</tt>" and "<tt style="white-space:pre-wrap">&lt;&lt;city_name&gt;&gt;</tt>" consist only of letters of the English alphabet and supply the name of the photo, the file name extension and the city name, respectively.</p>
<p>Write a function:</p>
<blockquote><p style="font-family: monospace; font-size: 9pt; display: block; white-space: pre-wrap"><tt>class Solution { public String solution(String S); }</tt></p></blockquote>
<p>that, given a string representing the list of M photos, returns the string representing the list of the new names of all photos (the order of photos should stay the same).</p>
<p>For example, given a string:</p>
<tt style="white-space:pre-wrap">photo.jpg, Warsaw, 2013-09-05 14:08:15
john.png, London, 2015-06-20 15:13:22
myFriends.png, Warsaw, 2013-09-05 14:07:13
Eiffel.jpg, Paris, 2015-07-23 08:03:02
pisatower.jpg, Paris, 2015-07-22 23:59:59
BOB.jpg, London, 2015-08-05 00:02:03
notredame.png, Paris, 2015-09-01 12:00:00
me.jpg, Warsaw, 2013-09-06 15:40:22
a.png, Warsaw, 2016-02-13 13:33:50
b.jpg, Warsaw, 2016-01-02 15:12:22
c.jpg, Warsaw, 2016-01-02 14:34:30
d.jpg, Warsaw, 2016-01-02 15:15:01
e.png, Warsaw, 2016-01-02 09:49:09
f.png, Warsaw, 2016-01-02 10:55:32
g.jpg, Warsaw, 2016-02-29 22:13:11</tt>
<p>your function should return:</p>
<tt style="white-space:pre-wrap">Warsaw02.jpg
London1.png
Warsaw01.png
Paris2.jpg
Paris1.jpg
London2.jpg
Paris3.png
Warsaw03.jpg
Warsaw09.png
Warsaw07.jpg
Warsaw06.jpg
Warsaw08.jpg
Warsaw04.png
Warsaw05.png
Warsaw10.jpg</tt>
<p>as there are ten photos taken in Warsaw (numbered from 01 to 10), two photos in London (numbered from 1 to 2) and three photos in Paris (numbered from 1 to 3).</p>
<p>The new names of the photos are returned in the same order as in the given string.</p>
<p>Assume that:</p>
<blockquote><ul style="margin: 10px;padding: 0px;"><li>M is an integer within the range [1..100];</li>
<li>Each year is an integer within the range [2000..2020];</li>
<li>Each line of the input string is of the       format "<tt style="white-space:pre-wrap">&lt;&lt;photoname&gt;&gt;.&lt;&lt;extension&gt;&gt;, &lt;&lt;city_name&gt;&gt;, yyyy-mm-dd hh:mm:ss</tt>" and lines are separated with newline characters;</li>
<li>Each photo name (without extension}) and city name consists       only of at least 1 and at most 20 letters from the English alphabet;</li>
<li>Each name of the city starts with a capital letter and is followed by lower case letters;</li>
<li>No two photos from the same location share the same date and time;</li>
<li>Each extension is "<tt style="white-space:pre-wrap">jpg</tt>", "<tt style="white-space:pre-wrap">png</tt>" or "<tt style="white-space:pre-wrap">jpeg</tt>".</li>
</ul>
</blockquote><p>In your solution, focus on <b><b>correctness</b></b>. The performance of your solution will not be the focus of the assessment.</p>
</div>
<div style="margin-top:5px">
<small>Copyright 2009–2018 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.</small>
</div>

</div></div>