import { Component, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'mg-filters-bar',
  templateUrl: './filters-bar.component.html',
  styleUrls: ['./filters-bar.component.css']
})
export class FiltersBarComponent {
  _isVisible = false;

  @Input()
  selectedId: number;

  @Output()
  clearFiltersPressed: EventEmitter<any> = new EventEmitter();

  @Input()
  set isVisible(value: boolean) {
    this._isVisible = this.selectedId && value;
  }

  get isVisible() {
    return this._isVisible;
  }

  onClearFiltersPressed() {
    this.clearFiltersPressed.emit();
  }
}
