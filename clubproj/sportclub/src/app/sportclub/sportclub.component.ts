import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { SportclubService } from './sportclub.service';

@Component({
  selector: 'app-sportclub',
  templateUrl: './sportclub.component.html',
  styleUrl: './sportclub.component.css'
})
export class SportclubComponent implements OnInit {
  private _signUpForm!: FormGroup;
  transformedObject: any;

  constructor(private formBuilder: FormBuilder,private sportclubService: SportclubService) { }

  ngOnInit() {
    this._signUpForm = this.formBuilder.group({
      fullName: ['', [Validators.required, Validators.minLength(5)]],
      dateOfBirth: ['', Validators.required],
      gender: ['',Validators.required],
      address: ['', [Validators.required, Validators.minLength(5)]],
      email: ['', [Validators.required, Validators.email]],
      contactNumber: ['', [Validators.required, Validators.minLength(10)]],
      sportsPreference: ['',[]],
      skillLevel: [''],
      membershipType: ['',Validators.required],
      emergencyContactNumber: ['']
    });
  }
 
  get signUpForm(): FormGroup {
    return this._signUpForm;
  }

  onSubmit() {
    const inputObject = this.signUpForm.value;
      this.transformedObject = this.sportclubService.transformObject(inputObject);
      console.log(this.transformedObject);
    //console.log(this.signUpForm.value);
  }
}
