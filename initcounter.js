var combatants = [];

class combatant {
  constructor( Name, Init ) {
    this.name = Name;
    this.init = Init;
  };


  get getName() {
    return this.name;
  }
  set setName (val) {
    this.name = val;
  }

  get getInit() {
    return this.Init;
  }
  set setInit (val) {
    this.init = val;
  }
};

function addToList( Com = new combatant ) {
  var list = document.getElementById('list');
  var entry = document.createElement("li");
  entry.appendChild(document.createTextNode( Com.getName() + " " + Com.getInit() ) );
  list.appendChild( li );
}

function takeInfo() {
  var nameEntry = document.getElementsByName('NameEntry');
  var initEntry = document.getElementsByName('InitEntry');

  var com = new combatant( nameEntry.value, initEntry.value );
  addToList( com );
}

console.log();
