
import java.util.*;
import java.util.Iterator;

class StudentContainer implements Iterable<Student> {

	private Student[] array = new Student[0];

	void add(Student object) {
		// **********************************************
		Student[] old = array;
		array = Arrays.copyOf(old, old.length + 1);
		// **********************************************
		// Use Arrays.copyOf() instead of the above code.
		// **********************************************
		array[old.length] = object;
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}

	/**
	 * Returns the number of elements in this list.
	 *
	 * @return the number of elements in this list
	 */
	public int size() {
		// TODO: Add your implementation here.
		return array.length;
	}

	/**
	 * Removes all of the elements from this container. The container will be empty
	 * after this call returns.
	 */
	public void clear() {
		array = new Student[0];
	}

	/**
	 * Returns the element at the specified position in this container.
	 *
	 * @param index index of the element to return
	 * @return the element at the specified position in this container
	 */
	public Student get(int index) {
		// TODO: Add your implementation here.
		return array[index];
	}

	/**
	 * Replaces the element at the specified position in this container with the
	 * specified element.
	 *
	 * @param index   index of the element to replace
	 * @param element element to be stored at the specified position
	 * @return the element previously at the specified position
	 */
	public Student set(int index, Student element) {
		array[index] = element;
		return element;
	}

	/**
	 * Removes the element at the specified position in this container. Shifts any
	 * subsequent elements to the left (subtracts one from their indices).
	 *
	 * @param index the index of the element to be removed
	 * @return the element that was removed from the list
	 */
	public Student remove(int index) {
		if (index < 0 || index >= this.array.length) {

			throw new IndexOutOfBoundsException(index);
		}
		Student removed = this.array[index];
		Student[] temp = new Student[this.array.length - 1];
		for (int i = 0, j = 0; i < this.array.length; i++) {
			if (i != index) {
				temp[j++] = this.array[i];
			}

		}
		this.array = temp;
		return removed;
	}

	/**
	 * Returns an array containing all of the elements in this container in proper
	 * sequence (from first to last element).
	 * <p>
	 * The returned array must be "safe", that is, this container cannot maintain
	 * any references to it. In other words, this method must allocate a new array.
	 * The caller is thus free to modify the returned array.
	 *
	 * @return an array containing all of the elements in this container in proper
	 *         sequence
	 */
	public Student[] toArray() {
		return Arrays.copyOf(array, array.length);

	}
	// TODO: Add your implementation here.

	@Override
	public Iterator<Student> iterator() {
		// TODO Auto-generated method stub
		return new StudentIterator();
	}

	private class StudentIterator implements Iterator<Student> {
		int i = 0;
int lastRead = -1;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub

			return i < size();
		}

		@Override
		public Student next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}

			// TODO Auto-generated method stub
			return get(lastRead = i++);
			
		}

		public void remove() {
			// Add your implementation here.
			StudentContainer.this.remove(lastRead);
			i--;
			lastRead = -1;
		}
		
	}
}
