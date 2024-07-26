import { Component } from '@angular/core';
// import { FormGroup, FormBuilder, Validators } from '@angular/forms';
// import { of } from 'rxjs';
import { CustomerTS } from '../../types/Customer';

@Component({
  selector: 'app-customerarray',
  standalone: true,
  imports: [],
  templateUrl: './customerarray.component.html',
  styleUrls: ['./customerarray.component.css']
})
export class CustomerarrayComponent {
  customer:CustomerTS[] = [
    new CustomerTS("John Doe", "john@gmail.com", "johnDoe", "johnDoe123", "Developer", "1"),
    new CustomerTS("Jane Doe", "jane@gmail.com", "janeDoe", "janeDoe123", "Developer", "2"),
    new CustomerTS("Jhonny Doe", "jhonny@gmail.com", "jhonnyDoe", "jhonnyDoe123", "Developer", "3")
    ]
  
}
