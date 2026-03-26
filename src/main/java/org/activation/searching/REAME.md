## Why Don't We Use a `for` Loop for Binary Search?

- **The step size is unpredictable.**
  In a standard `for` loop, you usually have a consistent increment like `i++`.
  In binary search:
    - Sometimes `low` jumps by a large amount.
    - Sometimes `high` jumps by a large amount.
    - The "step" changes every single time based on where `mid` lands.

- **`for` vs `while` — design intent.**
    - **`for` loop:** Best when you know exactly how many iterations you need (e.g., "do this 10 times" or "iterate over every item in the list").
    - **`while` loop:** Best when you want to keep going until a condition changes (e.g., "keep searching until the pointers cross").

- **A `for` loop version looks clunky.**
  If we tried to write binary search with a `for` loop, we'd have to leave the increment section empty — which is non-standard and harder to read:
```java
  // Non-standard — the increment section is intentionally empty
  for (int low = 0, high = arr.length - 1; low <= high; ) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) return mid;

        if (arr[mid] > key) high = mid - 1;
        else low = mid + 1;
    }
```

The `while` loop expresses the intent more clearly: *keep searching while the search space is valid*.