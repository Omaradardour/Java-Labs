package customContainer;

import java.util.*;

class Container<E> implements Iterable<E> {

	private Object[] array = new Object[0];

	void add(E object) {
		// **********************************************
		Object[] old = array;
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
		array = new Object[0];
	}

	/**
	 * Returns the element at the specified position in this container.
	 *
	 * @param index index of the element to return
	 * @return the element at the specified position in this container
	 */
	@SuppressWarnings("unchecked")
	public E get(int index) {
		// TODO: Add your implementation here.
		return (E) array[index];
	}

	/**
	 * Replaces the element at the specified position in this container with the
	 * specified element.
	 *
	 * @param index   index of the element to replace
	 * @param element element to be stored at the specified position
	 * @return the element previously at the specified position
	 */
	public E set(int index, E element) {
		@SuppressWarnings("unchecked")
		E old = (E) array[index];
		array[index] = element;
		return old;
	}

	/**
	 * Removes the element at the specified position in this container. Shifts any
	 * subsequent elements to the left (subtracts one from their indices).
	 *
	 * @param index the index of the element to be removed
	 * @return the element that was removed from the list
	 */
	public E remove(int index) {

		if (index < 0 || index >= this.array.length) {

			throw new IndexOutOfBoundsException(index);
		}
		@SuppressWarnings("unchecked")
		E removed = (E) this.array[index];
		Object[] temp = new Object[this.array.length - 1];
		System.arraycopy(array, 0, temp, 0, index);
		System.arraycopy(array, index + 1, temp, index, temp.length - index);
//		for (int i = 0, j = 0; i < this.array.length; i++) {
//			if (i != index) {
//				temp[j++] = this.array[i];
//			}

//		}
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
	public Object[] toArray() {
		return Arrays.copyOf(array, array.length);

	}

	public boolean addAll(Collection<? extends E> c) {
		Object[] a = c.toArray();
		if (a.length == 0) {
			return false;
		}
		Object[] newArray = new Object[array.length + a.length];
		System.arraycopy(array, 0, newArray, 0, array.length);

		System.arraycopy(a, 0, newArray, array.length, a.length);
		array = newArray;

		// Add your implementation here.
		// You cam use System.arraycopy()
		// ...
		return true;
	}

	/**
	 * Sorts this list according to the order induced by the specified
	 * {@link Comparator}.
	 * 
	 * @param c the Comparator used to compare list elements. A null value indicates
	 *          that the Comparable elements should be used.
	 */
	@SuppressWarnings("unchecked")
	void sort(Comparator<E> c) {
		// Here you can use the sorting method from the Java library.

		Arrays.sort((E[]) array, c);
	}

//	// TODO: Add your implementation here.
	public static void main(String[] args) {
		Container<Student2> container = new Container<>();
		container.add(new Student2(1111));
		container.add(new Student2(2222));
		container.add(new Student2(3333));
		System.out.println(container);
		System.out.println(container.set(1, new Student2(4444)));
		System.out.println(container);
		System.out.println(container.remove(2));
		System.out.println(container);
		container.remove(0);
		System.out.println(container);
		System.out.println(Arrays.toString(container.toArray()));
		Container<String> str = new Container<>();
		str.add("ccc");
		str.add("bbb");
		str.add("aaa");
		System.out.println(str);
		System.out.println(str.set(0, "zzz"));
		System.out.println(str);
		System.out.println(str.remove(2));
		System.out.println(str);
		str.addAll(Arrays.asList("ddd", "fff", "eee"));
		System.out.println(str);
		Container<One> one = new Container<>();
		one.add(new One(1));
		one.add(new One(2));
		one.add(new One(3));
		System.out.println(one);
		System.out.println(one.set(1, new One(999)));
		System.out.println(one);
		System.out.println(one.remove(2));
		System.out.println(one);
		one.addAll(Arrays.asList(new One(222), new One(777), new One(555)));
		System.out.println(one);
		container.add(new Student2(5555));
		container.add(new Student2(6666));
		container.add(new Student2(1111));
		System.out.println(container);

		container.sort(new Comparator<Student2>() {

			@Override
			public int compare(Student2 o1, Student2 o2) {
				// TODO Auto-generated method stub
				return -Integer.compare(o1.GradeBook_num, o2.GradeBook_num);
			}
		});
		System.out.println(container);
		System.out.println(str);
		str.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});

		System.out.println(str);
		System.out.println(one);
		one.sort(new Comparator<One>() {

			@Override
			public int compare(One o1, One o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.i, o2.i);

			}
		});

		System.out.println(one);
		System.out.println("-----");
		Iterator<One> iterator = one.iterator();
		while (iterator.hasNext()) {
			One x = iterator.next();
			System.out.println(x);
		}
		iterator = one.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		System.out.println(one.size());
		System.out.println(one);
		System.out.println("-----");
		Container<Integer> intContainer = new Container<>();
		intContainer.addAll(Arrays.asList(Integer.valueOf(0xFF), Integer.valueOf(0x121), Integer.valueOf(0xE00E),
				Integer.valueOf(0xE0E0), Integer.valueOf(0x0E0)

		));
		System.out.println(intContainer);
		Iterator<Integer> it = intContainer.iterator();
		while (it.hasNext()) {
			Integer y = it.next();
			String asHex = Integer.toHexString(y);
			System.out.println(asHex);
			StringBuilder sb = new StringBuilder(asHex);
			String reversed = sb.reverse().toString();
			System.out.println(reversed);
			if (asHex.equals(reversed)) {
				it.remove();
				System.out.println(asHex + " removed");
				
			}
			

		}
		System.out.println(intContainer);
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub

		return new SimpleIterator();
	}

	private class SimpleIterator implements Iterator<E> {
		// Add some fields here if needed.
		int i = 0;
		int lastRead = -1;

		public boolean hasNext() {
			return i < size();
		}

		public E next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return get(lastRead = i++);
		}

		public void remove() {
			Container.this.remove(lastRead);
			i--;
			lastRead = -1;
		}

	}
}
