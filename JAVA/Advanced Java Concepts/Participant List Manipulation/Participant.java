
public class Participant {
String participantName;
String departmentName;
String collegeName;
public String getParticipantName() {
	return participantName;
}
public void setParticipantName(String participantName) {
	this.participantName = participantName;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String toString(){
    return participantName + " "+ departmentName + " "+ collegeName;
}

}
