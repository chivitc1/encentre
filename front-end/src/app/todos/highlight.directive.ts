import { Directive, OnInit, Input, ElementRef } from '@angular/core';

@Directive({
  selector: '[appHighlight]',
  host: {
    '(click)' : 'selected()'
  }
})
export class HighlightDirective implements OnInit{

  @Input('appHighlight')
  color: string;

  private el: HTMLElement;

  ngOnInit(): void {
    // this.el.style.backgroundColor = this.color;
  }
  constructor(el: ElementRef) {
    this.el = el.nativeElement;
   }

   selected() {
     this.el.style.backgroundColor = this.el.style.backgroundColor? null : this.color;
   }

}
