/* Created by: Nikaansh S.
 * Last Edited: 5/12/23
 * This class has two nodes that are the start and the end of the edge along with its label. It also has a getter and setter for each of them
 */

public class Edge {
    
    Node first;
    Node second;
    String label;

    public Edge (Node newFirst, Node newSecond, String newLabel) {
        first = newFirst;
        second = newSecond;
        label = newLabel;
    }

    public Node getOtherEnd(Node n) {
		if (first.equals(n)) {
			return second;
		}
		else if (second.equals(n)) {
			return first;
		}
		else {
			return null;
		}
	}

    public Node getFirst() {
        return first;
    }
    public void setFirst(Node first) {
        this.first = first;
    }
    public Node getSecond() {
        return second;
    }
    public void setSecond(Node second) {
        this.second = second;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }


}
