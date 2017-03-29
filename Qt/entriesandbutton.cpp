#include "entriesandbutton.h"
#include "ui_entriesandbutton.h"

EntriesAndButton::EntriesAndButton(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::EntriesAndButton)
{
    ui->setupUi(this);
}

EntriesAndButton::~EntriesAndButton()
{
    delete ui;
}

void EntriesAndButton::on_pushButton_clicked()
{
    MainWindow* parent;
    parent = const_cast<MainWindow*>( this->parentWidget() );
    parent->addCombatant( ui->nimiEdit, ui->initEdit );
}
