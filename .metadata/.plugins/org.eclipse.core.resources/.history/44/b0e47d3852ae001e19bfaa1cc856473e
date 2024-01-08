package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {

	private List<Integer> listStudents = new ArrayList<Integer>();

	public Course() {
	}

	public List<Integer> getListStudents() {
		return listStudents;
	}

	public void addStudents(int student) {
		this.listStudents.add(student);
	}

	@Override
	public int hashCode() {
		return Objects.hash(listStudents);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(listStudents, other.listStudents);
	}

}
