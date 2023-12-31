import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SportclubService {

  constructor() { }
  
  transformObject(inputObject: any): any {
    return {
      address: inputObject.address || '',
      fullName: inputObject.fullName || '',
      email: inputObject.email || '',
      sportsPreference: (inputObject.sportsPreference || '').split(',').map((sport: string) => sport.trim()).filter(Boolean),
      emergencyContactNumber: inputObject.emergencyContactNumber || '',
      membershipType: inputObject.membershipType || '',
      dateOfBirth: inputObject.dateOfBirth || '',
      gender: inputObject.gender || '',
      contactNumber: inputObject.contactNumber || '',
      skillLevel: inputObject.skillLevel || ''
    };
  }
 
}
