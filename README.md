# Groovy NullPointerException in List Iteration

This repository demonstrates a common Groovy error: a `NullPointerException` that arises when attempting to iterate over a list that is unexpectedly null. The bug is in the `myMethod` function.  The solution provides a robust approach to avoid the exception.

## Bug
The `bug.groovy` file contains the faulty code.  The `myMethod` function does not handle the case where the input `list` is null.  Calling `myMethod(null)` will throw a `NullPointerException`. 

## Solution
The `bugSolution.groovy` file offers a corrected version. The solution uses the safe navigation operator (`?.`) to prevent the exception.  If the list is null, `each` will not be invoked.  Alternatively, a null check can also be implemented.
