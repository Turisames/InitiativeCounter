var combatants = [];

class combatant {

  constructor( Name, Init ) {
    this.name = Name;
    this.init = Init;
  }

  gibName(){
    return this.name;
  }

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

  entry.appendChild(document.createTextNode( Com.name + "\t" + Com.init ));
  list.appendChild( entry );
  clearEntries();
}

function clearEntries() {
  var nameEntry = document.getElementById("NameEntry")
  var initEntry = document.getElementById("InitEntry");
  nameEntry.value = "";
  initEntry.value = "";
}

function takeInfo() {
  var nameEntry = document.getElementById("NameEntry")
  var initEntry = document.getElementById("InitEntry");

  if (nameEntry.value != "" && initEntry.value != ""){

    if ( Number( Number.isInteger( parseInt( initEntry.value ) )  ) ) {
      var com = new combatant( nameEntry.value, initEntry.value );
      addToList( com );
    }
  }
}
