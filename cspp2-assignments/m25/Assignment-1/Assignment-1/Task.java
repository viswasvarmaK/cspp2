/**
 * Class for task.
 */
class Task {
	String title;
	String assignedTo;
	int  timeToComplete;
	boolean important;
	boolean urgent;
	String status;

	/**
	 * Constructs the object.
	 *
	 * @param      title           The title
	 * @param      assignedTo      The assigned to
	 * @param      timeToComplete  The time to complete
	 * @param      important       The important
	 * @param      urgent          The urgent
	 * @param      status          The status
	 */
	public Task(String title, String assignedTo, int  timeToComplete,
	 boolean important, boolean urgent, String status) throws Exception {
	 	if (title.equals("") || title == null) throw new Exception ("Title not provided");
	 	if (timeToComplete < 0) throw new Exception ("Invalid timeToComplete" + timeToComplete);
	 	if (!status.equals("todo") && !status.equals("done")) throw new Exception("Invalid status" + status);
	 	this.title = title;
	 	this.assignedTo = assignedTo;
	 	this.timeToComplete = timeToComplete;
	 	this.important = important;
	 	this.urgent = urgent;
	 	this.status = status;

	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		String impt = "Not Important";
		String urgt = "Not Urgent";
        if(important) impt = "Important";
        if (urgent) urgt = "Urgent";
		String display = title + "," + assignedTo + ","
		 + timeToComplete + "," + impt + "," + urgt + "," + status;
		 return display;
	}
    }