package feri.rvir.elocator.rest.resource.tracking;

import java.io.Serializable;

public class Tracking implements Serializable {

	private static final long serialVersionUID = 1L;

    private Long key;
	private Long trackerKey;
	private Long child;
	
	public Tracking(Long trackerKey, Long child) {
		this.trackerKey = trackerKey;
		this.child = child;
	}

	public Tracking(Long key, Long trackerKey, Long child) {
		this.key = key;
		this.trackerKey = trackerKey;
		this.child = child;
	}

	public Long getKey() {
		return key;
	}
	
	public void setKey(Long key) {
		this.key = key;
	}
	
	public Long getTrackerKey() {
		return trackerKey;
	}
	
	public void setTrackerKey(Long trackerKey) {
		this.trackerKey = trackerKey;
	}
	
	public Long getChild() {
		return child;
	}
	
	public void setChild(Long child) {
		this.child = child;
	}
	
}
