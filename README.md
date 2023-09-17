# Dining Philosophers 📖

## Implementation 🚀
<ul>
    <li>Progress bars intervals of 25% for "eating" and "thinking" states (not "waiting" because the time is unknown). </li>
    <li>Graphic changes of every philosopher state (sleeping, eating, thinking, waiting). </li>
    <li>Implementation of a toggle pause/resume button, when the lifecycle of philosophers finish they fall asleep. </li>
    <li>MVC architecture, controller communicates states between view and models. </li>
    <li>Graphic Console for each philosopher to monitor states and shared resources (forks). </li>
    <li>Friendly User Interface. </li>
</ul>

<p align="center"> 
    <img src="img/application.jpg" width="310px">
</p>

## Problem Description 💡
<p>
    Five philosophers sit at the table, each one has a plate of spaghetti.<br>
    The spaghetti is so slippery that a philosopher needs two forks to eat it.<br>
    Between every two plates, there is a fork.
</p>

<p align="center">
    <img src="img/rdm1.png" width="300px">
</p>

<p>
    The life of a philosopher consists of alternating periods for eating and thinking. When a philosopher is hungry, they try to get a fork for their left hand and another for their right hand, picking them up one at a time and in any order. If they manage to obtain both forks, they eat for a while and then they put the forks down and continue thinking.
</p>

## Requirements of the Program🔍
<ul>
    <li>Graphic environment.</li>
    <li>Controls and actions for interaction with the environment of each problem.</li>
    <li>Comprehensive monitoring of the states and behavior of each process.</li>
    <li>Comprehensive monitoring of the state and behavior of each shared resource.</li>
    <li>Execution threads must accurately implement the states of the processes.</li>
</ul>

## Process State Explanation 🔧
<p>
    We have 3 main states.
    <ol>
        <li>Ready</li>
        <li>Running</li>
        <li>Waiting</li>
    </ol>
    A process can't pass from "blocked" to "running", it have to go change its state to "ready".<br>
</p>

<p align="center">
    <img src="img/process-states.png" width="500px">
</p>

## Abstraction of Project Concepts 🔧

**Thread:** Philosopher<br>
**Async Task:**  Taking or Leaving a Fork<br>
**Shared Resource:** Fork (2 philosopher can't share a single fork simultaneously).<br>
**Critical Section:** When a Philosopher takes a fork and notifies the other four philosophers.<br>

## What if? Cases ❓❓❓

### Deadlock Case
<ol>
    <li>All philosophers are hungry at the same time.</li>
    <li>Every philospher sits</li>
    <li>Every philosopher takes the fork on their left</li>
    <li>Every philosopher tries to take the fork on their right</li>
</ol>

<p align="center"> 
    <img src="img/deadlock.JPG" width="310px">
</p>

<p>
    If we analyze this case, we can conclude that all the philosophers would be in the thinking mode, and they will wait for the fork on their right, but this will never happen.<br>
    This problem finds practical application in Operating Systems, particularly in contexts involving memory, file systems, and more.<br>
    We don't want two processes that mutually lock each other out. Process A could be waiting for the result of process B and B could be waiting for the result of process A...<br>
    To solve this we will use a monitor, this can control the order in which things happen. This is done using a "lock", we can request access and other people can't get access, then the lock is returned and everyone can request again. <br>
    Lock must be atomic, we must implement a mechanism so if 2 philosophers ask for the right to pick up fork, just one request of the lock will be successful.
</p>



