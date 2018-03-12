#Create a directive 
- ToDos is component consist of list of <div>todo</div>
- Create appHightlight directive to change <div> todo item</div> to be hightlighted when event select/click occurs

##appHightlight directive 
- ng generate directive todos/hightlight
- use host event: mapping event from HTML element which host this directive with handler method
host: {
    '(click)' : 'selected()'
  }
- handler selected(): set host's ele style base on its current style, to null or this.color to toggle
  selected() {
     this.el.style.backgroundColor = this.el.style.backgroundColor? null : this.color;
   }
- this.color is a @Input() to accept binding value which is also a color property from the host todos component
##When user click an item 
- the background color of item toggle on / off

