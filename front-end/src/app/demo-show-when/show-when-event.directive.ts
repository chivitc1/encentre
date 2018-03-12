import { Directive, TemplateRef, ViewContainerRef, Input } from '@angular/core';

@Directive({
  selector: '[appShowWhenEvent]'
})
export class ShowWhenEventDirective {

  constructor( 
    private templateRef: TemplateRef<any>,
    private viewContainer: ViewContainerRef) { }

  @Input('appShowWhenEvent')
  set showWhenEvent(value: number) {
    if (value % 2 == 0) {
      this.viewContainer.createEmbeddedView(this.templateRef);
    } else {
      this.viewContainer.clear();
    }
  }

}
