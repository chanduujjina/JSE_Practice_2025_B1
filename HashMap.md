🧠 Internal Workflow of HashMap.put(K key, V value)
| Step | What Happens                                                                                                                                                                |
| ---- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1️⃣  | Compute **hash code** of the key using `key.hashCode()`                                                                                                                     |
| 2️⃣  | Apply **hash function** to determine index in the bucket array: `index = (n - 1) & hash`                                                                                    |
| 3️⃣  | If the **bucket is empty**, insert the entry as a **new node**                                                                                                              |
| 4️⃣  | If bucket already has entries:<ul><li>Check if **equal key exists** (using `equals()`)</li><li>If yes → update value</li><li>If no → append new node to list/tree</li></ul> |
| 5️⃣  | If entries exceed threshold (default 0.75 \* capacity), **resize** (rehash into new array)                                                                                  |
| 6️⃣  | If chain size > 8 and array size > 64, convert linked list → **Red-Black Tree**                                                                                             |
