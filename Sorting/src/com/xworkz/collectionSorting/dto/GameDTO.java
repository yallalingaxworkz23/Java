package com.xworkz.collectionSorting.dto;

	import java.io.Serializable;
	import java.time.LocalDate;

	public class GameDTO  implements Serializable,Comparable<GameDTO> {
		private int id;
		private String name;
		private Double participants;
		private Double points;
		private LocalDate eventDate;
		private String winner;
		private String runnerup;
		private Double duration;
		
		public GameDTO() {
			// TODO Auto-generated constructor stub
		}
		public GameDTO(int id, String name, Double participants, Double points, LocalDate eventDate, String winner,
				String runnerup, Double duration) {
			super();
			this.id = id;
			this.name = name;
			this.participants = participants;
			this.points = points;
			this.eventDate = eventDate;
			this.winner = winner;
			this.runnerup = runnerup;
			this.duration = duration;
		}
		@Override
		public String toString() {
			return "GameDTO [id=" + id + ", name=" + name + ", participants=" + participants + ", points=" + points
					+ ", eventDate=" + eventDate + ", winner=" + winner + ", runnerup=" + runnerup + ", duration="
					+ duration + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((duration == null) ? 0 : duration.hashCode());
			result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((participants == null) ? 0 : participants.hashCode());
			result = prime * result + ((points == null) ? 0 : points.hashCode());
			result = prime * result + ((runnerup == null) ? 0 : runnerup.hashCode());
			result = prime * result + ((winner == null) ? 0 : winner.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			GameDTO other = (GameDTO) obj;
			if (duration == null) {
				if (other.duration != null)
					return false;
			} else if (!duration.equals(other.duration))
				return false;
			if (eventDate == null) {
				if (other.eventDate != null)
					return false;
			} else if (!eventDate.equals(other.eventDate))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (participants == null) {
				if (other.participants != null)
					return false;
			} else if (!participants.equals(other.participants))
				return false;
			if (points == null) {
				if (other.points != null)
					return false;
			} else if (!points.equals(other.points))
				return false;
			if (runnerup == null) {
				if (other.runnerup != null)
					return false;
			} else if (!runnerup.equals(other.runnerup))
				return false;
			if (winner == null) {
				if (other.winner != null)
					return false;
			} else if (!winner.equals(other.winner))
				return false;
			return true;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getParticipants() {
			return participants;
		}
		public void setParticipants(Double participants) {
			this.participants = participants;
		}
		public Double getPoints() {
			return points;
		}
		public void setPoints(Double points) {
			this.points = points;
		}
		public LocalDate getEventDate() {
			return eventDate;
		}
		public void setEventDate(LocalDate eventDate) {
			this.eventDate = eventDate;
		}
		public String getWinner() {
			return winner;
		}
		public void setWinner(String winner) {
			this.winner = winner;
		}
		public String getRunnerup() {
			return runnerup;
		}
		public void setRunnerup(String runnerup) {
			this.runnerup = runnerup;
		}
		public Double getDuration() {
			return duration;
		}
		public void setDuration(Double duration) {
			this.duration = duration;
		}
		@Override
		public int compareTo(GameDTO arguments) {
			GameDTO current =this;
			if(this.id==arguments.id) {
				return 0;
			}
			if(this.id>arguments.id) {
				return 1;
			}
			if(this.id<arguments.id) {
				return -1;
			}
			return 0;
		}
	}
		