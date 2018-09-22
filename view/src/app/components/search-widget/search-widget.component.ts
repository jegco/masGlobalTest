import { Component, EventEmitter, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'mg-search-widget',
  templateUrl: './search-widget.component.html',
  styleUrls: ['./search-widget.component.css']
})
export class SearchWidgetComponent {
  form: FormGroup;

  @Output()
  search: EventEmitter<number> = new EventEmitter();

  constructor(private formBuilder: FormBuilder) {
    this.form = formBuilder.group({
      id: [null, [Validators.required, Validators.pattern('[0-9]+')]]
    });
  }

  onSubmit() {
    const id = this.form.controls.id.value;
    this.search.emit(parseInt(id));
  }
}
