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

function compare(a, b) {
  if (a.init < b.init)
    return 1;
  if (a.init > b.init)
    return -1;
  return 0;
}

function addToList( Com = new combatant ) {
  var list = document.getElementById('list');

// Empty the list
  while( list.firstChild ){
    list.removeChild( list.firstChild );
  }

  combatants.push( Com );
  combatants.sort( compare );

  for (var i = 0; i < combatants.length; ++i){
    let tmp = combatants[i];
    let word = tmp.name + "\t\t\t\t" + tmp.init ;
    let entry = document.createElement("li");
    entry.appendChild( document.createTextNode( word ) );
    list.appendChild( entry );
  }
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
