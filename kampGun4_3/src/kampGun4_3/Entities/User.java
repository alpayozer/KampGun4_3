package kampGun4_3.Entities;

import kampGun4_3.Abstarct.EntityService;

public class User implements EntityService{

		private int id;
		private String nationaltyId;
		private String firstName;
		private String lastName;
		private String dateOfBirth;
		private String cardId;
		
		public User() {
			
		}
		

		public User(int id, String nationaltyId, String firstName, String lastName, String dateOfBirth, String cardId) {
			super();
			this.id = id;
			this.nationaltyId = nationaltyId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.cardId = cardId;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCardId() {
			return cardId;
		}

		public void setCardId(String cardId) {
			this.cardId = cardId;
		}

		public String getNationaltyId() {
			return nationaltyId;
		}

		public void setNationaltyId(String nationaltyId) {
			this.nationaltyId = nationaltyId;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		
		
}
