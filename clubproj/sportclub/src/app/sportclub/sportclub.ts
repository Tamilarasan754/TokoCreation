export class Sportclub {
    id?: number;  // Change the type to match the type of your Id field
    fullName?: string;  // Update the property names to match your entity
    dateOfBirth?: Date;
    gender?: string;
    address?: string;
    email?: string;
    contactNumber?: string;
    sportsPreference?:String[];  // Assuming SportsPreference is a List of Strings
    skillLevel?: string;
    membershipType?: string;
    emergencyContactNumber?: string;
}
