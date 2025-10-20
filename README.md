High-Level vs Machine-Level Programming Languages
In Java programming, high-level languages like Java are designed to be easily understood by humans. 
They use English-like syntax and abstract away hardware details. For example, a simple Java statement like System.out.println("Hello"); is readable.
On the other hand, machine-level languages consist of binary code (0s and 1s) that the computer's processor can execute directly. These are not human-friendly and are specific to the architecture of the machine. For instance, a machine-level instruction might look like 10110000 01100001, which is incomprehensible without technical decoding.
In summary, high-level languages prioritize programmer convenience and portability, while machine-level languages focus on direct hardware control and performance.


ii) Difference Between a For Loop and a While Loop
A for loop is typically used when the number of iterations is known beforehand. It combines initialization, condition checking, and incrementing in one line. For example:
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
This loop prints numbers from 0 to 4.
A while loop, however, is used when the number of iterations is not predetermined. It only checks the condition before each iteration, and initialization and incrementing must be handled separately. For example:
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

