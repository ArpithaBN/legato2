class Movie {

	private int movie_id;
	private String name;
	private int duration;
	private static int count;
    
	
	static int getCount() {
		return count;
	}
	private void setCount(int count) {
		this.count = count;
	}
	int getMovie_id() {
		return movie_id;
	}
	void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getDuration() {
		return duration;
	}
	void setDuration(int duration) {
		this.duration = duration;
	}

	Movie(int movie_id,String name,int duration){
		this.movie_id=movie_id;
		this.name=name;
		this.duration=duration;
		System.out.println("movie_id="+this.movie_id+" name="+this.name+" Duration="+this.duration);
	count++;
	}
	
}

