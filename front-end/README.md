#Create a directive 
- The directive accepts a numeric field from the component and
- Based on the value of the input, content will be added or removed.

- generate component for demo
 ng generate component demoShowWhen

- generate directive
ng generate directive demo-show-when/showWhenEvent

- component use directive
<p *appShowWhenEvent="value">
  I show you this when value is an even number.
</p>

- directive need an @Input()
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

  - use method createEmbeddedView() to show element
  - use method clear() to hide element