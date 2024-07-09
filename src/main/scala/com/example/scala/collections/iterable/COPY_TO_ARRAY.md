
---

### copyToArray

### Reference: <https://docs.scala-lang.org/overviews/collections-2.13/trait-iterable.html>

---

Let's go through an example for `copyToArray` to understand how it works.

![Copy To Array](copy_to_array.png "Copy To Array")

The `copyToArray` method copies elements from a collection into an array. The method signature is:

```scala
def copyToArray[B >: A](xs: Array[B], start: Int = 0, len: Int = Int.MaxValue): Unit
```

- **`arr`**: The target array into which elements will be copied.
- **`s`**: The starting index in the array at which to begin copying. (Optional, defaults to 0)
- **`n`**: The maximum number of elements to copy. (Optional, defaults to the length of the collection or the length of the array, whichever is smaller)

### Example

Let's consider an example where we use `copyToArray` to copy elements from a list into an array.

```scala
val list = List(1, 2, 3, 4, 5)
val array = Array.fill(10)(0) // Initialize an array of size 10 with all elements set to 0

// Copy elements from the list to the array starting at index 3, with a maximum of 3 elements copied
list.copyToArray(array, 3, 3)

println(array.mkString(", ")) // Output: 0, 0, 0, 1, 2, 3, 0, 0, 0, 0
```

#### Explanation:

1. **Initialize List and Array**:
   ```scala
   val list = List(1, 2, 3, 4, 5)
   val array = Array.fill(10)(0) // Initialize an array of size 10 with all elements set to 0
   ```

2. **Copy Elements**:
   ```scala
   list.copyToArray(array, 3, 3)
   ```

    - **Source**: `list` (List(1, 2, 3, 4, 5))
    - **Target Array**: `array` (Initially Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
    - **Start Index (`s`)**: 3
    - **Maximum Elements (`n`)**: 3

   This means that up to 3 elements from `list` will be copied into `array` starting at index 3.

3. **Result**:
   ```scala
   println(array.mkString(", ")) // Output: 0, 0, 0, 1, 2, 3, 0, 0, 0, 0
   ```

   The first three elements of `list` (1, 2, 3) are copied into `array` starting at index 3. The rest of the array remains unchanged.

### Summary

- **`copyToArray`**: Copies elements from a collection into an array.
- **Parameters**:
    - **`arr`**: Target array.
    - **`s`**: Starting index in the array (optional, default is 0).
    - **`n`**: Maximum number of elements to copy (optional, default is the length of the collection or array).
- **Example**: Copy elements from a list into an array starting at a specific index.

This method is useful when you need to copy elements from a collection into a pre-existing array, with control over the starting index and the number of elements to copy.

---

